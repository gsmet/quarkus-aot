package fr.spacefox.perftests.quarkus.data.entity456;

import fr.spacefox.perftests.quarkus.core.port.data.Entity456DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service456.model.Model456;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity456Repository implements Entity456DatasourcePort, PanacheRepository<Entity456> {
    @Override
    public Optional<Model456> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
