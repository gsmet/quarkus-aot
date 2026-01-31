package fr.spacefox.perftests.quarkus.rest.endpoint412;

import fr.spacefox.perftests.quarkus.core.service412.model.Model412;
import fr.spacefox.perftests.quarkus.rest.endpoint412.schema.Schema412;

final class Mapper {
    private Mapper() {}

    public static Schema412 of(Model412 model) {
        return new Schema412(model.id(), model.value());
    }
}
