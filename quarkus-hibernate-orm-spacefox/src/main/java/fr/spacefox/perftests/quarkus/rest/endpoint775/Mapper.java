package fr.spacefox.perftests.quarkus.rest.endpoint775;

import fr.spacefox.perftests.quarkus.core.service775.model.Model775;
import fr.spacefox.perftests.quarkus.rest.endpoint775.schema.Schema775;

final class Mapper {
    private Mapper() {}

    public static Schema775 of(Model775 model) {
        return new Schema775(model.id(), model.value());
    }
}
