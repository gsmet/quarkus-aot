package fr.spacefox.perftests.quarkus.rest.endpoint750;

import fr.spacefox.perftests.quarkus.core.service750.model.Model750;
import fr.spacefox.perftests.quarkus.rest.endpoint750.schema.Schema750;

final class Mapper {
    private Mapper() {}

    public static Schema750 of(Model750 model) {
        return new Schema750(model.id(), model.value());
    }
}
