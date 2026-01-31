package fr.spacefox.perftests.quarkus.data.entity271;

import fr.spacefox.perftests.quarkus.core.port.data.Entity271DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service271.model.Model271;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity271Repository implements Entity271DatasourcePort, PanacheRepository<Entity271> {
    @Override
    public Optional<Model271> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
