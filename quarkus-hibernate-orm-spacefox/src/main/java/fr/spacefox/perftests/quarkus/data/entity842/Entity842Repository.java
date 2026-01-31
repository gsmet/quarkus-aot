package fr.spacefox.perftests.quarkus.data.entity842;

import fr.spacefox.perftests.quarkus.core.port.data.Entity842DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service842.model.Model842;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity842Repository implements Entity842DatasourcePort, PanacheRepository<Entity842> {
    @Override
    public Optional<Model842> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
