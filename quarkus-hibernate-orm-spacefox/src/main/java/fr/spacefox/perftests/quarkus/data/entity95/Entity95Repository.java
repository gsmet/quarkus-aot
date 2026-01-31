package fr.spacefox.perftests.quarkus.data.entity95;

import fr.spacefox.perftests.quarkus.core.port.data.Entity95DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service95.model.Model95;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity95Repository implements Entity95DatasourcePort, PanacheRepository<Entity95> {
    @Override
    public Optional<Model95> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
