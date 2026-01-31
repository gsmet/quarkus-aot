package fr.spacefox.perftests.quarkus.data.entity543;

import fr.spacefox.perftests.quarkus.core.service543.model.Model543;

final class Mapper {
    private Mapper() {}

    public static Model543 of(Entity543 entity) {
        return new Model543(entity.getId(), entity.getField());
    }
}
