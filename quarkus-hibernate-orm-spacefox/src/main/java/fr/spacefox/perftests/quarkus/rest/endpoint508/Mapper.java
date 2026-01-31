package fr.spacefox.perftests.quarkus.rest.endpoint508;

import fr.spacefox.perftests.quarkus.core.service508.model.Model508;
import fr.spacefox.perftests.quarkus.rest.endpoint508.schema.Schema508;

final class Mapper {
    private Mapper() {}

    public static Schema508 of(Model508 model) {
        return new Schema508(model.id(), model.value());
    }
}
