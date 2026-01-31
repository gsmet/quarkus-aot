package fr.spacefox.perftests.quarkus.data.entity335;

import fr.spacefox.perftests.quarkus.core.port.data.Entity335DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service335.model.Model335;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity335Repository implements Entity335DatasourcePort, PanacheRepository<Entity335> {
    @Override
    public Optional<Model335> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
