package fr.spacefox.perftests.quarkus.rest.endpoint545;

import fr.spacefox.perftests.quarkus.core.service545.model.Model545;
import fr.spacefox.perftests.quarkus.rest.endpoint545.schema.Schema545;

final class Mapper {
    private Mapper() {}

    public static Schema545 of(Model545 model) {
        return new Schema545(model.id(), model.value());
    }
}
