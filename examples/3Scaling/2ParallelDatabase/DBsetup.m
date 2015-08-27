%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% Setup binding to a database.
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

if ~exist('myName','var')
    myName = 'DH_';      % SET LOCAL LABEL TO AVOID COLLISIONS.
end

%INSTANCENAME = 'classdb54';
%[DB,G] = DBsetupLLGrid('classdb54', '/home/gridsan/');                                      % Create binding to database.  Shorthand for:
INSTANCENAME = 'instance-1.7.0';
DB = DBserver('localhost:2181','Accumulo',INSTANCENAME,'root','secret');
G = DBaddJavaOps('edu.mit.ll.graphulo.MatlabGraphulo',INSTANCENAME,'localhost:2181','root','secret');
% DB = DBserver('llgrid-db-00.llgrid.ll.mit.edu:2181','Accumulo','accumulo','AccumuloUser',password);
% Check status of database at http://llgrid-db-00.llgrid.ll.mit.edu:50095                                                

Tadj = DB([myName 'TgraphAdj'],[myName 'TgraphAdjT']);    % Create database table pair for holding adjacency matrix.
TadjDeg = DB([myName 'TgraphAdjDeg']);                    % Create database table for counting degree.

Tedge = DB([myName 'TgraphEdge'],[myName 'TgraphEdgeT']); % Create database table pair for holding incidense matrix.
TedgeDeg = DB([myName 'TgraphEdgeDeg']);                  % Create database table for counting degree.
Tedge1 = DB([myName 'TgraphEdge']);                       % Create binding for setting split.
Tedge2 = DB([myName 'TgraphEdgeT']);                      % Create binding for setting split.


%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% D4M: Dynamic Distributed Dimensional Data Model
% Architect: Dr. Jeremy Kepner (kepner@ll.mit.edu)
% Software Engineer: Dr. Jeremy Kepner (kepner@ll.mit.edu)
% MIT Lincoln Laboratory
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% (c) <2010> Massachusetts Institute of Technology
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

