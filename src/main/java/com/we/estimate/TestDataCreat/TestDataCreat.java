package com.we.estimate.TestDataCreat;

import com.github.javafaker.Faker;
import com.we.estimate.Entity.ShaIn;
import org.springframework.context.annotation.Bean;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestDataCreat {

    public ShaIn shaInTestDataCreat(Faker faker) {
        ShaIn shaIn = new ShaIn();

        shaIn.setTdInsert(new Timestamp(faker.date().past(30, TimeUnit.DAYS).getTime()));
        shaIn.setIdUserI(faker.lorem().characters(15));
        shaIn.setIdComputerI(faker.lorem().characters(15));
        shaIn.setIdPgI(faker.lorem().characters(15));
        shaIn.setTdUpdate(new Timestamp(faker.date().past(30, TimeUnit.DAYS).getTime()));
        shaIn.setIdUserU(faker.lorem().characters(15));
        shaIn.setIdComputerU(faker.lorem().characters(15));

        shaIn.setIdPgU(faker.lorem().characters(15));
        shaIn.setTdDelete(new Timestamp(faker.date().past(30, TimeUnit.DAYS).getTime()));
        shaIn.setIdUserD(faker.lorem().characters(15));
        shaIn.setIdComputerD(faker.lorem().characters(15));
        shaIn.setIdPgD(faker.lorem().characters(15));
        shaIn.setFgDelete(faker.random().nextInt(0, 1));
        shaIn.setTdBat(new Timestamp(faker.date().past(30, TimeUnit.DAYS).getTime()));
        shaIn.setIdUserB(faker.lorem().characters(15));
        shaIn.setIdComputerB(faker.lorem().characters(15));
        shaIn.setIdPgB(faker.lorem().characters(15));
        shaIn.setIdUserGodI(faker.lorem().characters(15));
        shaIn.setIdUserGodU(faker.lorem().characters(15));
        shaIn.setIdUserGodD(faker.lorem().characters(15));
        shaIn.setIdUserGodB(faker.lorem().characters(15));

        shaIn.setCdKaisha(faker.regexify("[A-Z]{4}"));
        shaIn.setCdBusho(faker.lorem().characters(10));
        shaIn.setCdShain(faker.lorem().characters(10));
        shaIn.setKnShain(faker.lorem().characters(15));
        shaIn.setNmShain(faker.lorem().characters(15));
        shaIn.setKbShain(faker.random().nextInt(0, 1));
        shaIn.setKbKessai(faker.random().nextInt(0, 1));
        shaIn.setCdGinkoShiten(faker.random().nextInt(1, 9999999));
        shaIn.setKnMeigi(faker.lorem().characters(15));
        shaIn.setKbKozaShubetsu(faker.random().nextInt(0, 1));
        shaIn.setNoKoza(faker.random().nextInt(1000000, 9999999));
        shaIn.setKbFruites(faker.regexify("[A-Z]{3}"));
        shaIn.setCdBu(faker.lorem().characters(10));
        shaIn.setKbDairi(faker.random().nextInt(0, 1));
        shaIn.setCdDairiKankatsu(faker.lorem().characters(10));
        shaIn.setKbMenuSk(faker.regexify("[A-Z]{2}"));
        shaIn.setKbShozokuMc5(faker.regexify("[A-Z]{1}"));
        shaIn.setKbKengenMc5(faker.regexify("[A-Z]{1}"));
        shaIn.setNmYobi(faker.regexify("[A-Z]{5}"));
        shaIn.setDtUpdate(faker.random().nextInt(0, 9999999));
        shaIn.setTmUpdate(faker.random().nextInt(0, 9999999));
        shaIn.setCdOldShain(faker.random().nextInt(1, 9999999));
        shaIn.setFgChkShushoku(faker.random().nextInt(0, 1));
        shaIn.setFgChkKyoiku(faker.random().nextInt(0, 1));
        shaIn.setFgYoshinDairiten(faker.random().nextInt(0, 1));
        shaIn.setNmYoshinCommentDairiten(faker.lorem().characters(300));
        shaIn.setKbWebKahi(faker.lorem().characters(1));


        return shaIn;
    }

    public List<ShaIn> shaInTestDataCreat(int count, Faker faker) {
        List<ShaIn> shaInsList = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            ShaIn shaIn = shaInTestDataCreat(faker);

            shaInsList.add(shaIn);
        }

        return shaInsList;
    }

}



