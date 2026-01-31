package fr.spacefox.perftests.quarkus.rest.endpoint342;

import fr.spacefox.perftests.quarkus.core.service342.model.Model342;
import fr.spacefox.perftests.quarkus.rest.endpoint342.schema.Schema342;

final class Mapper {
    private Mapper() {}

    public static Schema342 of(Model342 model) {
        return new Schema342(model.id(), model.value());
    }
}
