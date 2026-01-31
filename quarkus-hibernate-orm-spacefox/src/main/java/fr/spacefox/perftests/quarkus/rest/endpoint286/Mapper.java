package fr.spacefox.perftests.quarkus.rest.endpoint286;

import fr.spacefox.perftests.quarkus.core.service286.model.Model286;
import fr.spacefox.perftests.quarkus.rest.endpoint286.schema.Schema286;

final class Mapper {
    private Mapper() {}

    public static Schema286 of(Model286 model) {
        return new Schema286(model.id(), model.value());
    }
}
