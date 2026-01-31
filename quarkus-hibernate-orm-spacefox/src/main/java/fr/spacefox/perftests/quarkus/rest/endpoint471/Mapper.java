package fr.spacefox.perftests.quarkus.rest.endpoint471;

import fr.spacefox.perftests.quarkus.core.service471.model.Model471;
import fr.spacefox.perftests.quarkus.rest.endpoint471.schema.Schema471;

final class Mapper {
    private Mapper() {}

    public static Schema471 of(Model471 model) {
        return new Schema471(model.id(), model.value());
    }
}
