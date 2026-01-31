package fr.spacefox.perftests.quarkus.data.entity656;

import fr.spacefox.perftests.quarkus.core.port.data.Entity656DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service656.model.Model656;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity656Repository implements Entity656DatasourcePort, PanacheRepository<Entity656> {
    @Override
    public Optional<Model656> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
