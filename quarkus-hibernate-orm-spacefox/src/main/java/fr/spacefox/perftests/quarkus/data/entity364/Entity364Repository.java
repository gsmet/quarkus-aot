package fr.spacefox.perftests.quarkus.data.entity364;

import fr.spacefox.perftests.quarkus.core.port.data.Entity364DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service364.model.Model364;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity364Repository implements Entity364DatasourcePort, PanacheRepository<Entity364> {
    @Override
    public Optional<Model364> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
