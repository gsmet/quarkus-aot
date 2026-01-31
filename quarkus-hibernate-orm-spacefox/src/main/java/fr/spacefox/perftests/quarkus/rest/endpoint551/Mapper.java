package fr.spacefox.perftests.quarkus.rest.endpoint551;

import fr.spacefox.perftests.quarkus.core.service551.model.Model551;
import fr.spacefox.perftests.quarkus.rest.endpoint551.schema.Schema551;

final class Mapper {
    private Mapper() {}

    public static Schema551 of(Model551 model) {
        return new Schema551(model.id(), model.value());
    }
}
