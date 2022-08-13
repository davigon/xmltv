package com.github.davigon.xmltv.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;

import java.util.List;

@Builder
@Getter
public class Tv {
    private final String date;

    private final String sourceInfoUrl;

    private final String sourceInfoName;

    private final String sourceDataUrl;

    private final String generatorInfoName;

    private final String generatorInfoUrl;

    @Singular
    private final List<Channel> channels;

    @Singular
    private final List<Programme> programmes;
}
