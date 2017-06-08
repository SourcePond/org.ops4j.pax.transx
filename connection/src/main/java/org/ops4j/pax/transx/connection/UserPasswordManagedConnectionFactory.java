/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.ops4j.pax.transx.connection;

import javax.resource.spi.ManagedConnectionFactory;

/**
 * A specialization of {@link ManagedConnectionFactory} that provides access to a defined
 * user name and password credential that should be used for all connections.
 *
 * @version $Revision: 508 $ $Date: 2007-09-20 19:02:45 -0700 (Thu, 20 Sep 2007) $
 */
public interface UserPasswordManagedConnectionFactory extends ManagedConnectionFactory {

    /**
     * Return the user name used to establish the connection.
     *
     * @return the user name used to establish the connection
     */
    String getUserName();

    /**
     * Return the password credential used to establish the connection.
     *
     * @return the password credential used to establish the connection
     */
    String getPassword();
}
