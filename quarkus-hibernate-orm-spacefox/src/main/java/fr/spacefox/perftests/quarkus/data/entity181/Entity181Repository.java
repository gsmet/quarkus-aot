package fr.spacefox.perftests.quarkus.data.entity181;

import fr.spacefox.perftests.quarkus.core.port.data.Entity181DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service181.model.Model181;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity181Repository implements Entity181DatasourcePort, PanacheRepository<Entity181> {
    @Override
    public Optional<Model181> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
