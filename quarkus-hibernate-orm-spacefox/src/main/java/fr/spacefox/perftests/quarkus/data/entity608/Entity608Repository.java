package fr.spacefox.perftests.quarkus.data.entity608;

import fr.spacefox.perftests.quarkus.core.port.data.Entity608DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service608.model.Model608;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity608Repository implements Entity608DatasourcePort, PanacheRepository<Entity608> {
    @Override
    public Optional<Model608> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
