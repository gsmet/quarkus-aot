package fr.spacefox.perftests.quarkus.data.entity954;

import fr.spacefox.perftests.quarkus.core.port.data.Entity954DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service954.model.Model954;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity954Repository implements Entity954DatasourcePort, PanacheRepository<Entity954> {
    @Override
    public Optional<Model954> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
