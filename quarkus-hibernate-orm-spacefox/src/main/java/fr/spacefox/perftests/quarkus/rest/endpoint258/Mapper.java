package fr.spacefox.perftests.quarkus.rest.endpoint258;

import fr.spacefox.perftests.quarkus.core.service258.model.Model258;
import fr.spacefox.perftests.quarkus.rest.endpoint258.schema.Schema258;

final class Mapper {
    private Mapper() {}

    public static Schema258 of(Model258 model) {
        return new Schema258(model.id(), model.value());
    }
}
