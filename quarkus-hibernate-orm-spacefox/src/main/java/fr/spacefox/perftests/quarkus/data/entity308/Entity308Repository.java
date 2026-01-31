package fr.spacefox.perftests.quarkus.data.entity308;

import fr.spacefox.perftests.quarkus.core.port.data.Entity308DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service308.model.Model308;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity308Repository implements Entity308DatasourcePort, PanacheRepository<Entity308> {
    @Override
    public Optional<Model308> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
