package fr.spacefox.perftests.quarkus.data.entity586;

import fr.spacefox.perftests.quarkus.core.service586.model.Model586;

final class Mapper {
    private Mapper() {}

    public static Model586 of(Entity586 entity) {
        return new Model586(entity.getId(), entity.getField());
    }
}
