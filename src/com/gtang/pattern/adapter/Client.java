
package com.gtang.pattern.adapter;

import java.util.ArrayList;
import java.util.List;

import com.gtang.data.engine.Engine;
import com.gtang.data.engine.StandardEngine;
import com.gtang.data.engine.SuperGreenEngine;
import com.gtang.data.engine.TurboEngine;

public class Client {

    public static void main (String[] args) {

        List <Engine> list = new ArrayList <Engine>();

        list.add(new StandardEngine(1200));
        list.add(new TurboEngine(2000));
        list.add(new SuperGreenEngineAdapter(new SuperGreenEngine(2500)));

        for (Engine eng : list) {
            System.out.println(eng);
        }

    }

}
