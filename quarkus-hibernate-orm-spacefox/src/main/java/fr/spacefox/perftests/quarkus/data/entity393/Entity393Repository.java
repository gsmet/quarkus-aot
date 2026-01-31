package fr.spacefox.perftests.quarkus.data.entity393;

import fr.spacefox.perftests.quarkus.core.port.data.Entity393DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service393.model.Model393;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity393Repository implements Entity393DatasourcePort, PanacheRepository<Entity393> {
    @Override
    public Optional<Model393> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
