package fr.spacefox.perftests.quarkus.rest.endpoint659;

import fr.spacefox.perftests.quarkus.core.service659.model.Model659;
import fr.spacefox.perftests.quarkus.rest.endpoint659.schema.Schema659;

final class Mapper {
    private Mapper() {}

    public static Schema659 of(Model659 model) {
        return new Schema659(model.id(), model.value());
    }
}
