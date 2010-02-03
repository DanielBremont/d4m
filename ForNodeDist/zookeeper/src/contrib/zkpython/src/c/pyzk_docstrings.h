/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

#ifndef PYZK_DOCSTRINGS_H
#define PYZK_DOCSTRINGS_H

const char pyzk_acreate_doc[] = 
"Create a node asynchronously.\n"
"\n"
"This method will create a node in ZooKeeper. A node can only be created if\n"
"it does not already exists. The Create Flags affect the creation of nodes.\n"
"If EPHEMERAL flag is set, the node will automatically get removed if the\n"
"client session goes away. If the SEQUENCE flag is set, a unique\n"
"monotonically increasing sequence number is appended to the path name.\n"
"\n"
" zh: the zookeeper handle obtained by a call to zookeeper.init\n"
" path: The name of the node. Expressed as a file name with slashes \n"
"separating ancestors of the node.\n"
" value: The data to be stored in the node.\n"
" acl: The initial ACL of the node. If None, the ACL of the parent will be\n"
"   used.\n"
"\n"
" (Subsequent parameters are optional)\n"
" flags: this parameter can be set to 0 for normal create or an OR\n"
"   of the Create Flags\n"
" completion: the routine to invoke when the request completes. The completion\n"
"will be triggered with one of the following codes passed in as the rc argument:\n"
"OK operation completed succesfully\n"
"NONODE the parent node does not exist.\n"
"NODEEXISTS the node already exists\n"
"NOAUTH the client does not have permission.\n"
"NOCHILDRENFOREPHEMERALS cannot create children of ephemeral nodes.\n"
"\n"
"RETURNS:\n"
"Returns OK on success or throws of the following errcodes on failure:\n"
"EXCEPTIONS:\n"
"BADARGUMENTS - invalid input parameters\n"
"INVALIDSTATE - zhandle state is either SESSION_EXPIRED_STATE or AUTH_FAILED_STATE\n"
"MARSHALLINGERROR - failed to marshall a request; possibly, out of memory";

static const char pyzk_client_id_doc[] = 
"Return the client session id, only valid if the connections\n"
" is currently connected (ie. last watcher state is CONNECTED_STATE)";

static const char pyzk_state_doc[] = 
"Get the state of the zookeeper connection.\n"
  "The return value will be one of the State Consts.";
  
static const char pyzk_adelete_doc[] = 
" Delete a node in zookeeper.\n"
"\n"
" zh: the zookeeper handle obtained by a call to zookeeper.init\n"
" path: the name of the node. Expressed as a file name with slashes \n"
"separating ancestors of the node.\n"
"\n"
"(Subsequent parameters are optional)\n"
" version: the expected version of the node. The function will fail if the\n"
"   actual version of the node does not match the expected version.\n"
" If -1 is used the version check will not take place. \n"
" completion: the routine to invoke when the request completes. The completion\n"
"will be triggered with one of the following codes passed in as the rc argument:\n"
"OK operation completed succesfully\n"
"NONODE the node does not exist.\n"
"NOAUTH the client does not have permission.\n"
"BADVERSION expected version does not match actual version.\n"
"NOTEMPTY children are present; node cannot be deleted.\n"
"Returns OK on success or one of the following errcodes on failure:\n"
"BADARGUMENTS - invalid input parameters\n"
"INVALIDSTATE - zhandle state is either SESSION_EXPIRED_STATE or AUTH_FAILED_STATE\n"
  "MARSHALLINGERROR - failed to marshall a request; possibly, out of memory";

static const char pyzk_aexists_doc[] = 
" checks the existence of a node in zookeeper.\n"
"\n"
" zh the zookeeper handle obtained by a call to zookeeper.init\n"
" path the name of the node. Expressed as a file name with slashes \n"
"separating ancestors of the node.\n"
"\n"
"(Subsequent parameters are optional)\n"
" watch: if not None, a watch will be set at the server to notify the \n"
"client if the node changes. The watch will be set even if the node does not \n"
"exist. This allows clients to watch for nodes to appear.\n"
"\n"
" completion: the routine to invoke when the request completes. The completion\n"
"will be triggered with one of the following codes passed in as the rc argument:\n"
" OK operation completed succesfully\n"
" NONODE the node does not exist.\n"
" NOAUTH the client does not have permission.\n"
" data the data that will be passed to the completion routine when the \n"
"function completes.\n"
" OK on success or one of the following errcodes on failure:\n"
" BADARGUMENTS - invalid input parameters\n"
" INVALIDSTATE - zhandle state is either SESSION_EXPIRED_STATE or AUTH_FAILED_STATE\n"
" MARSHALLINGERROR - failed to marshall a request; possibly, out of memory";

static const char pyzk_aget_doc[] = 
"Gets the data associated with a node.\n"
"\n"
" zh the zookeeper handle obtained by a call to zookeeper.init\n"
" path the name of the node. Expressed as a file name with slashes \n"
"separating ancestors of the node.\n"
"\n"
"(Subsequent parameters are optional)\n"
" watcher if not None, a watch will be set at the server to notify \n"
"the client if the node changes.\n"
" completion: the routine to invoke when the request completes. The completion\n"
"will be triggered with one of the following codes passed in as the rc argument:\n"
" OK operation completed succesfully\n"
" NONODE the node does not exist.\n"
" NOAUTH the client does not have permission.\n"
" data the data that will be passed to the completion routine when \n"
"the function completes.\n"
"Returns OK on success or one of the following errcodes on failure:\n"
" BADARGUMENTS - invalid input parameters\n"
" INVALIDSTATE - zhandle state is either in SESSION_EXPIRED_STATE or AUTH_FAILED_STATE\n"
  " MARSHALLINGERROR - failed to marshall a request; possibly, out of memory";

static const char pyzk_aset_doc[] = 
" Sets the data associated with a node.\n"
"\n"
" zh the zookeeper handle obtained by a call to zookeeper.init\n"
" path the name of the node. Expressed as a file name with slashes \n"
"separating ancestors of the node.\n"
" buffer the buffer holding data to be written to the node.\n"
" buflen the number of bytes from buffer to write.\n"
"\n"
"(Subsequent parameters are optional)\n"
" version the expected version of the node. The function will fail if \n"
"the actual version of the node does not match the expected version. If -1 is \n"
"used the version check will not take place.\n"
"completion: If None, \n"
"the function will execute synchronously. Otherwise, the function will return \n"
"immediately and invoke the completion routine when the request completes.\n"
" completion the routine to invoke when the request completes. The completion\n"
"will be triggered with one of the following codes passed in as the rc argument:\n"
"OK operation completed succesfully\n"
"NONODE the node does not exist.\n"
"NOAUTH the client does not have permission.\n"
"BADVERSION expected version does not match actual version.\n"
" data the data that will be passed to the completion routine when \n"
"the function completes.\n"
"Returns OK on success or one of the following errcodes on failure:\n"
"BADARGUMENTS - invalid input parameters\n"
"INVALIDSTATE - zhandle state is either SESSION_EXPIRED_STATE or AUTH_FAILED_STATE\n"
"MARSHALLINGERROR - failed to marshall a request; possibly, out of memory";

static const char pyzk_aget_children_doc[] = 
" Lists the children of a node.\n"
"\n"
"This function is similar to zoo_aget_children except it allows one specify \n"
"a watcher object rather than a boolean watch flag.\n"
" \n"
" zh the zookeeper handle obtained by a call to zookeeper.init\n"
" path the name of the node. Expressed as a file name with slashes \n"
"separating ancestors of the node.\n"
"\n"
"(Subsequent parameters are optional)\n"
" watcher if non-null, a watch will be set at the server to notify \n"
"the client if the node changes.\n"
"\n"
" completion the routine to invoke when the request completes. The completion\n"
"will be triggered with one of the following codes passed in as the rc argument:\n"
"OK operation completed succesfully\n"
"NONODE the node does not exist.\n"
"NOAUTH the client does not have permission.\n"
"\n"
"Returns OK on success or one of the following errcodes on failure:\n"
"BADARGUMENTS - invalid input parameters\n"
"INVALIDSTATE - zhandle state is either SESSION_EXPIRED_STATE or AUTH_FAILED_STATE\n"
"MARSHALLINGERROR - failed to marshall a request; possibly, out of memory";

static const char pyzk_async_doc[] = 
" Flush leader channel.\n"
"\n"
" zh the zookeeper handle obtained by a call to zookeeper.init\n"
" path the name of the node. Expressed as a file name with slashes\n"
"separating ancestors of the node.\n"
" completion the routine to invoke when the request completes. The completion\n"
"will be triggered with one of the following codes passed in as the rc argument:\n"
"OK operation completed succesfully\n"
"NONODE the node does not exist.\n"
"NOAUTH the client does not have permission.\n"
"\n"
"Returns OK on success or one of the following errcodes on failure:\n"
"BADARGUMENTS - invalid input parameters\n"
"INVALIDSTATE - zhandle state is either SESSION_EXPIRED_STATE or AUTH_FAILED_STATE\n"
  "MARSHALLINGERROR - failed to marshall a request; possibly, out of memory";

const static char pyzk_aget_acl_doc[] = 
" Gets the acl associated with a node.\n"
"\n"
" zh: the zookeeper handle obtained by a call to zookeeper.init\n"
" path: the name of the node. Expressed as a file name with slashes \n"
"separating ancestors of the node.\n"
"\n"
"(Subsequent parameters are optional)\n"
" completion: the routine to invoke when the request completes. The completion\n"
"will be triggered with one of the following codes passed in as the rc argument:\n"
"OK operation completed succesfully\n"
"NONODE the node does not exist.\n"
"NOAUTH the client does not have permission.\n"
"\n"
"Returns:\n"
" OK on success or one of the following errcodes on failure:\n"
" BADARGUMENTS - invalid input parameters\n"
" INVALIDSTATE - zhandle state is either SESSION_EXPIRED_STATE or AUTH_FAILED_STATE\n"
" MARSHALLINGERROR - failed to marshall a request; possibly, out of memory";

const char pyzk_aset_acl_doc[] = 
" Sets the acl associated with a node.\n"
"\n"
"PARAMETERS:\n"
" zh: the zookeeper handle obtained by a call to zookeeper.init\n"
" path: the name of the node. Expressed as a file name with slashes \n"
"separating ancestors of the node.\n"
" buffer: the buffer holding the acls to be written to the node.\n"
" completion: the routine to invoke when the request completes. The completion\n"
"will be triggered with one of the following codes passed in as the rc argument:\n"
"OK operation completed succesfully\n"
"NONODE the node does not exist.\n"
"NOAUTH the client does not have permission.\n"
"INVALIDACL invalid ACL specified\n"
"BADVERSION expected version does not match actual version.\n"
""
" Returns OK on success or one of the following errcodes on failure:\n"
" BADARGUMENTS - invalid input parameters\n"
" INVALIDSTATE - zhandle state is either SESSION_EXPIRED_STATE or AUTH_FAILED_STATE\n"
" MARSHALLINGERROR - failed to marshall a request; possibly, out of memory";

const char pyzk_zerror_doc[] = 
"Returns an error string corresponding to an integer error code.\n"
"\n"
"PARAMETERS:\n"
" err: Error code\n"
"RETURNS:\n"
  " string corresponding to the return code\n";

const char pyzk_add_auth_doc[] = 
" specify application credentials.\n"
"\n"
"The application calls this function to specify its credentials for purposes\n"
"of authentication. The server will use the security provider specified by \n"
"the scheme parameter to authenticate the client connection. If the \n"
"authentication request has failed:\n"
"- the server connection is dropped\n"
"- the watcher is called with the AUTH_FAILED_STATE value as the state \n"
"parameter.\n"
"\n"
"PARAMETERS:\n"
" zh: the zookeeper handle obtained by a call to zookeeper.init\n"
" scheme the id of authentication scheme. Natively supported:\n"
"'digest' password-based authentication\n"
" cert: application credentials. The actual value depends on the scheme.\n"
" completion: the routine to invoke when the request completes. One of \n"
"the following result codes may be passed into the completion callback:\n"
"OK operation completed successfully\n"
"AUTHFAILED authentication failed \n"
"\n"
"RETURNS:\n"
"OK on success or one of the following errcodes on failure:\n"
"BADARGUMENTS - invalid input parameters\n"
"INVALIDSTATE - zhandle state is either SESSION_EXPIRED_STATE or AUTH_FAILED_STATE\n"
"MARSHALLINGERROR - failed to marshall a request; possibly, out of memory\n"
  "SYSTEMERROR - a system error occured\n";

const char pyzk_is_unrecoverable_doc[] = 
" checks if the current zookeeper connection state can't be recovered.\n"
"\n"
" The application must close the zhandle and try to reconnect.\n"
"\n"
"PARAMETERS:\n"
" zh the zookeeper handle (see zookeeper.init)\n"
"\n"
"RETURNS:\n"
  "INVALIDSTATE if connection is unrecoverable\n";

const char pyzk_set_debug_level_doc[] = 
"\brief sets the debugging level for the library \n"
"\n"
"PARAMETERS:\n"
" logLevel: One of LOG_LEVEL_ERROR, LOG_LEVEL_WARN, LOG_LEVEL_INFO or LOG_LEVEL_DEBUG\n"
"\n"
"RETURNS:\n"
  " None\n";

static const char pyzk_set_log_stream_doc[] = 
" sets the stream to be used by the library for logging \n"
"\n"
"The zookeeper library uses stderr as its default log stream. Applications\n"
"must make sure the stream is writable. Passing in NULL resets the stream \n"
  "to its default value (stderr).\n"
"\n"
"PARAMETERS:\n"
" logStream: a writable file object\n"
"RETURNS:\n"
" None\n";

static const char pyzk_deterministic_conn_order_doc[] = 
" enable/disable quorum endpoint order randomization\n"
"\n"
"If passed a non-zero value, will make the client connect to quorum peers\n"
"in the order as specified in the zookeeper.init() call.\n"
"A zero value causes zookeeper.init() to permute the peer endpoints\n"
"which is good for more even client connection distribution among the \n"
"quorum peers.\n"
"PARAMETERS:\n"
" yesOrNo\n"
"\n"
"RETURNS:\n"
  " None\n";

static const char pyzk_create_doc[] = 
" create a node synchronously.\n"
"\n"
"This method will create a node in ZooKeeper. A node can only be created if\n"
"it does not already exists. The Create Flags affect the creation of nodes.\n"
"If the EPHEMERAL flag is set, the node will automatically get removed if the\n"
"client session goes away. If the SEQUENCE flag is set, a unique\n"
"monotonically increasing sequence number is appended to the path name.\n"
"\n"
"PARAMETERS:\n"
" zh: the zookeeper handle obtained by a call to zookeeper.init\n"
" path: The name of the node. Expressed as a file name with slashes \n"
"separating ancestors of the node.\n"
" value: The data to be stored in the node.\n"
" acl: The initial ACL of the node. If null, the ACL of the parent will be\n"
"   used.\n"
" flags: this parameter can be set to 0 for normal create or an OR\n"
"   of the Create Flags\n"
" realpath: the real path that is created (this might be different than the\n"
"   path to create because of the SEQUENCE flag.\n"
" the maximum length of real path you would want.\n"
"\n"
"RETURNS:\n"
" The actual znode path that was created (may be different from path due to use of SEQUENTIAL\n" 
" flag).\n"
"EXCEPTIONS:\n"
" NONODE the parent node does not exist.\n"
" NODEEXISTS the node already exists\n"
" NOAUTH the client does not have permission.\n"
" NOCHILDRENFOREPHEMERALS cannot create children of ephemeral nodes.\n"
" BADARGUMENTS - invalid input parameters\n"
" INVALIDSTATE - zhandle state is either SESSION_EXPIRED_STATE or AUTH_FAILED_STATE\n"
  " MARSHALLINGERROR - failed to marshall a request; possibly, out of memory\n";

static const char pyzk_delete_doc[] = 
" delete a node in zookeeper synchronously.\n"
"\n"
"PARAMETERS:\n"
" zh the zookeeper handle obtained by a call to zookeeper.init\n"
" path the name of the node. Expressed as a file name with slashes \n"
"separating ancestors of the node.\n"
"\n"
"(Subsequent parameters are optional)\n"
" version: the expected version of the node. The function will fail if the\n"
"   actual version of the node does not match the expected version.\n"
" If -1 (the default) is used the version check will not take place. \n"
"\n"
"RETURNS:\n"
"One of the following values is returned.\n"
"OK operation completed succesfully\n"
"NONODE the node does not exist.\n"
"NOAUTH the client does not have permission.\n"
"BADVERSION expected version does not match actual version.\n"
"NOTEMPTY children are present; node cannot be deleted.\n"
"BADARGUMENTS - invalid input parameters\n"
"INVALIDSTATE - zhandle state is either SESSION_EXPIRED_STATE or AUTH_FAILED_STATE\n"
  "MARSHALLINGERROR - failed to marshall a request; possibly, out of memory\n";

static const char pyzk_exists_doc[] = 
" checks the existence of a node in zookeeper synchronously.\n"
"\n"
"PARAMETERS:\n"
" zh: the zookeeper handle obtained by a call to zookeeper.init\n"
" path: the name of the node. Expressed as a file name with slashes \n"
"separating ancestors of the node.\n"
"\n"
"(Subsequent parameters are optional)\n"
" watch: if nonzero, a watch will be set at the server to notify the \n"
"client if the node changes. The watch will be set even if the node does not \n"
"exist. This allows clients to watch for nodes to appear.\n"
"\n"
"RETURNS:\n"
" the return stat value of the node.\n"
"EXCEPTIONS:\n"
"OK operation completed succesfully\n"
"NONODE the node does not exist.\n"
"NOAUTH the client does not have permission.\n"
"BADARGUMENTS - invalid input parameters\n"
"INVALIDSTATE - zhandle state is either SESSION_EXPIRED_STATE or AUTH_FAILED_STATE\n"
  "MARSHALLINGERROR - failed to marshall a request; possibly, out of memory\n";


static const char pyzk_get_children_doc[] =
" lists the children of a node synchronously.\n"
"\n"
"PARAMETERS:\n"
" zh: the zookeeper handle obtained by a call to zookeeper.init\n"
" path: the name of the node. Expressed as a file name with slashes \n"
"separating ancestors of the node.\n"
"\n"
"(subsequent parameters are optional)\n"
" watcher: if non-null, a watch will be set at the server to notify \n"
"the client if the node changes.\n"
"\n"
"RETURNS:\n"
" A list of znode names\n"
"EXCEPTIONS:\n"
"NONODE the node does not exist.\n"
"NOAUTH the client does not have permission.\n"
"BADARGUMENTS - invalid input parameters\n"
"INVALIDSTATE - zhandle state is either SESSION_EXPIRED_STATE or AUTH_FAILED_STATE\n"
  "MARSHALLINGERROR - failed to marshall a request; possibly, out of memory\n";

static const char pyzk_set_doc[] = 
"\n"
" sets the data associated with a node. See set2 function if\n"
"you require access to the stat information associated with the znode.\n"
"\n"
"PARAMETERS:\n"
" zh: the zookeeper handle obtained by a call to zookeeper.init\n"
" path: the name of the node. Expressed as a file name with slashes \n"
"separating ancestors of the node.\n"
" buffer: the buffer holding data to be written to the node.\n"
"\n"
"(subsequent parameters are optional)\n"
" version: the expected version of the node. The function will fail if \n"
"the actual version of the node does not match the expected version. If -1 is \n"
"used the version check will not take place. \n"
"\n"
"RETURNS:\n"
" the return code for the function call.\n"
"OK operation completed succesfully\n"
"EXCEPTIONS:\n"
"NONODE the node does not exist.\n"
"NOAUTH the client does not have permission.\n"
"BADVERSION expected version does not match actual version.\n"
"BADARGUMENTS - invalid input parameters\n"
"INVALIDSTATE - zhandle state is either SESSION_EXPIRED_STATE or AUTH_FAILED_STATE\n"
  "MARSHALLINGERROR - failed to marshall a request; possibly, out of memory\n";

static const char pyzk_get_acl_doc[] = 
" gets the acl associated with a node synchronously.\n"
"\n"
"PARAMETERS:\n"
" zh: the zookeeper handle obtained by a call to zookeeper.init\n"
" path: the name of the node. Expressed as a file name with slashes \n"
"separating ancestors of the node.\n"
" acl: the return value of acls on the path.\n"
"RETURNS:"
" returns the stat of the path specified.\n"
"EXCEPTIONS:"
"NONODE the node does not exist.\n"
"NOAUTH the client does not have permission.\n"
"BADARGUMENTS - invalid input parameters\n"
"INVALIDSTATE - zhandle state is either SESSION_EXPIRED_STATE or AUTH_FAILED_STATE\n"
  "MARSHALLINGERROR - failed to marshall a request; possibly, out of memory\n";


static const char pyzk_set_acl_doc[] = 
" sets the acl associated with a node synchronously.\n"
"\n"
"PARAMETERS:\n"
" zh: the zookeeper handle obtained by a call to zookeeper.init\n"
" path: the name of the node. Expressed as a file name with slashes \n"
"separating ancestors of the node.\n"
" version: the expected version of the path.\n"
" acl: the acl to be set on the path. \n"
"\n"
"RETURNS:\n"
"OK operation completed succesfully\n"
"EXCEPTIONS:\n"
"NONODE the node does not exist.\n"
"NOAUTH the client does not have permission.\n"
"INVALIDACL invalid ACL specified\n"
"BADVERSION expected version does not match actual version.\n"
"BADARGUMENTS - invalid input parameters\n"
"INVALIDSTATE - zhandle state is either SESSION_EXPIRED_STATE or AUTH_FAILED_STATE\n"
  "MARSHALLINGERROR - failed to marshall a request; possibly, out of memory\n";

static const char pyzk_close_doc[] = 
" close the zookeeper handle and free up any resources.\n"
"\n"
"After this call, the client session will no longer be valid. The function\n"
"will flush any outstanding send requests before return. As a result it may \n"
"block.\n"
"\n"
"This method should only be called only once on a zookeeper handle. Calling\n"
"twice will cause undefined (and probably undesirable behavior).\n"
"\n"
"PARAMETERS:\n"
" zh: the zookeeper handle obtained by a call to zookeeper.init\n"
"RETURNS:\n"
"Regardless of the error code returned, the zhandle \n"
"will be destroyed and all resources freed. \n"
"OK - success\n"
"EXCEPTIONS:\n"
"BADARGUMENTS - invalid input parameters\n"
"MARSHALLINGERROR - failed to marshall a request; possibly, out of memory\n"
"OPERATIONTIMEOUT - failed to flush the buffers within the specified timeout.\n"
"CONNECTIONLOSS - a network error occured while attempting to send request to server\n"
  "SYSTEMERROR -- a system (OS) error occured; it's worth checking errno to get details\n";

static const char pyzk_set2_doc[] = 
"\n"
" sets the data associated with a node, and returns the associated stat structure.\n" 
"\n"
"PARAMETERS:\n"
" zh: the zookeeper handle obtained by a call to zookeeper.init\n"
" path: the name of the node. Expressed as a file name with slashes \n"
"separating ancestors of the node.\n"
" buffer: the buffer holding data to be written to the node.\n"
"\n"
"(subsequent parameters are optional)\n"
" version: the expected version of the node. The function will fail if \n"
"the actual version of the node does not match the expected version. If -1 is \n"
"used the version check will not take place. \n"
"\n"
"RETURNS:\n"
" the stat structure for the target znode\n"
"OK operation completed succesfully\n"
"EXCEPTIONS:\n"
"NONODE the node does not exist.\n"
"NOAUTH the client does not have permission.\n"
"BADVERSION expected version does not match actual version.\n"
"BADARGUMENTS - invalid input parameters\n"
"INVALIDSTATE - zhandle state is either SESSION_EXPIRED_STATE or AUTH_FAILED_STATE\n"
  "MARSHALLINGERROR - failed to marshall a request; possibly, out of memory\n";

static const char pyzk_init_doc[] = 
"This method creates a new handle and a zookeeper session that corresponds\n"
"to that handle. Session establishment is asynchronous, meaning that the\n"
"session should not be considered established until (and unless) an\n"
"event of state CONNECTED_STATE is received.\n"
"PARAMETERS:\n"
" host: comma separated host:port pairs, each corresponding to a zk\n"
"  server. e.g. '127.0.0.1:3000,127.0.0.1:3001,127.0.0.1:3002'\n"
"\n"
"(subsequent parameters are optional)\n"
" fn: the global watcher callback function. When notifications are\n"
"  triggered this function will be invoked.\n"
" recv_timeout: \n"
" (clientid, passwd)\n"
" clientid the id of a previously established session that this\n"
"  client will be reconnecting to. Clients can access the session id of an established, valid,\n"
"  connection by calling zoo_client_id. If\n"
"  the specified clientid has expired, or if the clientid is invalid for \n"
"  any reason, the returned zhandle_t will be invalid -- the zhandle_t \n"
"  state will indicate the reason for failure (typically\n"
"  EXPIRED_SESSION_STATE).\n"
"\n"
"RETURNS:\n"
" an integer handle. If it fails to create \n"
" a new zhandle the function throws an exception.\n";

static const char pyzk_get_doc[] = 
" gets the data associated with a node synchronously.\n"
"\n"
"\n"
"PARAMETERS:\n"
" zh the zookeeper handle obtained by a call to zookeeper.init\n"
" path the name of the node. Expressed as a file name with slashes \n"
"separating ancestors of the node.\n"
"\n"
"(subsequent parameters are optional)\n"
" watcher if not None, a watch will be set at the server to notify \n"
"the client if the node changes.\n"
"RETURNS:\n"
" the data associated with the node\n"
"OK operation completed succesfully\n"
"NONODE the node does not exist.\n"
"NOAUTH the client does not have permission.\n"
"BADARGUMENTS - invalid input parameters\n"
"INVALIDSTATE - zhandle state is either in SESSION_EXPIRED_STATE or AUTH_FAILED_STATE\n"
  "MARSHALLINGERROR - failed to marshall a request; possibly, out of memory\n";

#endif
