package fr.spacefox.perftests.quarkus.rest.endpoint783;

import fr.spacefox.perftests.quarkus.core.service783.model.Model783;
import fr.spacefox.perftests.quarkus.rest.endpoint783.schema.Schema783;

final class Mapper {
    private Mapper() {}

    public static Schema783 of(Model783 model) {
        return new Schema783(model.id(), model.value());
    }
}
