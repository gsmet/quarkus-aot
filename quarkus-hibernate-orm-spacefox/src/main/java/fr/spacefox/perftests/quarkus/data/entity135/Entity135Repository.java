package fr.spacefox.perftests.quarkus.data.entity135;

import fr.spacefox.perftests.quarkus.core.port.data.Entity135DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service135.model.Model135;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity135Repository implements Entity135DatasourcePort, PanacheRepository<Entity135> {
    @Override
    public Optional<Model135> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
