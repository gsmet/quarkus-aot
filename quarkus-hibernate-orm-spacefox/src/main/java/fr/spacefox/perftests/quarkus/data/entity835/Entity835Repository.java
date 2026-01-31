package fr.spacefox.perftests.quarkus.data.entity835;

import fr.spacefox.perftests.quarkus.core.port.data.Entity835DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service835.model.Model835;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity835Repository implements Entity835DatasourcePort, PanacheRepository<Entity835> {
    @Override
    public Optional<Model835> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
