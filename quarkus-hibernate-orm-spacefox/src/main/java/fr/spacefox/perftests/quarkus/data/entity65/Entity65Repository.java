package fr.spacefox.perftests.quarkus.data.entity65;

import fr.spacefox.perftests.quarkus.core.port.data.Entity65DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service65.model.Model65;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity65Repository implements Entity65DatasourcePort, PanacheRepository<Entity65> {
    @Override
    public Optional<Model65> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
