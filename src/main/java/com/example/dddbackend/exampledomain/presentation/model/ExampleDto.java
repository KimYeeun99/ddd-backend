package com.example.dddbackend.exampledomain.presentation.model;

import java.util.List;

public record ExampleDto(String id, String name, List<SubExampleDto> subExamples) {
}
