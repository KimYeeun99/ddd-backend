package com.example.dddbackend.exampledomain.domain.spi;

import com.example.dddbackend.exampledomain.domain.SubExample;

import java.util.List;

public interface SubExampleRepository {

    List<SubExample> findByExample(String exampleId);
}
