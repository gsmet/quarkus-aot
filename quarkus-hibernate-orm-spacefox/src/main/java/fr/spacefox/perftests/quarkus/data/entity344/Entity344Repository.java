package fr.spacefox.perftests.quarkus.data.entity344;

import fr.spacefox.perftests.quarkus.core.port.data.Entity344DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service344.model.Model344;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity344Repository implements Entity344DatasourcePort, PanacheRepository<Entity344> {
    @Override
    public Optional<Model344> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
