package fr.spacefox.perftests.quarkus.data.entity892;

import fr.spacefox.perftests.quarkus.core.port.data.Entity892DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service892.model.Model892;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity892Repository implements Entity892DatasourcePort, PanacheRepository<Entity892> {
    @Override
    public Optional<Model892> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
