package fr.spacefox.perftests.quarkus.data.entity457;

import fr.spacefox.perftests.quarkus.core.service457.model.Model457;

final class Mapper {
    private Mapper() {}

    public static Model457 of(Entity457 entity) {
        return new Model457(entity.getId(), entity.getField());
    }
}
