package fr.spacefox.perftests.quarkus.data.entity379;

import fr.spacefox.perftests.quarkus.core.port.data.Entity379DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service379.model.Model379;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity379Repository implements Entity379DatasourcePort, PanacheRepository<Entity379> {
    @Override
    public Optional<Model379> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
