package fr.spacefox.perftests.quarkus.data.entity804;

import fr.spacefox.perftests.quarkus.core.port.data.Entity804DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service804.model.Model804;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity804Repository implements Entity804DatasourcePort, PanacheRepository<Entity804> {
    @Override
    public Optional<Model804> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
