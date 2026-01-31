package fr.spacefox.perftests.quarkus.data.entity938;

import fr.spacefox.perftests.quarkus.core.port.data.Entity938DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service938.model.Model938;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity938Repository implements Entity938DatasourcePort, PanacheRepository<Entity938> {
    @Override
    public Optional<Model938> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
