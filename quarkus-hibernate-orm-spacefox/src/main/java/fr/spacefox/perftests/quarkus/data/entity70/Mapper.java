package fr.spacefox.perftests.quarkus.data.entity70;

import fr.spacefox.perftests.quarkus.core.service70.model.Model70;

final class Mapper {
    private Mapper() {}

    public static Model70 of(Entity70 entity) {
        return new Model70(entity.getId(), entity.getField());
    }
}
