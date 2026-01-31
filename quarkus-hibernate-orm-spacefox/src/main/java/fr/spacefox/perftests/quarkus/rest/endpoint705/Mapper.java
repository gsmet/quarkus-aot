package fr.spacefox.perftests.quarkus.rest.endpoint705;

import fr.spacefox.perftests.quarkus.core.service705.model.Model705;
import fr.spacefox.perftests.quarkus.rest.endpoint705.schema.Schema705;

final class Mapper {
    private Mapper() {}

    public static Schema705 of(Model705 model) {
        return new Schema705(model.id(), model.value());
    }
}
