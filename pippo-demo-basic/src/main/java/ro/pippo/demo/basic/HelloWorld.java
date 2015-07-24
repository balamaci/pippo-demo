/*
 * Copyright (C) 2015 the original author or authors.
 *
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
 */
package ro.pippo.demo.basic;

import ro.pippo.core.Pippo;
import ro.pippo.core.route.RouteContext;
import ro.pippo.core.route.RouteHandler;

/**
 * @author Decebal Suiu
 */
public class HelloWorld {

    public static void main(String[] args) {
        // the super short version
        Pippo.send("Hello World!");

        // the "clean" approach
        /*
        Pippo pippo = new Pippo();
        pippo.getApplication().GET("/", new RouteHandler() {

            @Override
            public void handle(RouteContext routeContext) {
                routeContext.send("Hello World!");
            }

        });
        pippo.start();
        */
    }

}