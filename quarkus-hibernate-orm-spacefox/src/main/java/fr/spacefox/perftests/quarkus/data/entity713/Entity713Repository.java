package fr.spacefox.perftests.quarkus.data.entity713;

import fr.spacefox.perftests.quarkus.core.port.data.Entity713DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service713.model.Model713;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity713Repository implements Entity713DatasourcePort, PanacheRepository<Entity713> {
    @Override
    public Optional<Model713> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
