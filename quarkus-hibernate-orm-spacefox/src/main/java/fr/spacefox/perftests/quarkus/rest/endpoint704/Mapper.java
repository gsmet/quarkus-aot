package fr.spacefox.perftests.quarkus.rest.endpoint704;

import fr.spacefox.perftests.quarkus.core.service704.model.Model704;
import fr.spacefox.perftests.quarkus.rest.endpoint704.schema.Schema704;

final class Mapper {
    private Mapper() {}

    public static Schema704 of(Model704 model) {
        return new Schema704(model.id(), model.value());
    }
}
