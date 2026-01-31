package fr.spacefox.perftests.quarkus.data.entity751;

import fr.spacefox.perftests.quarkus.core.port.data.Entity751DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service751.model.Model751;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity751Repository implements Entity751DatasourcePort, PanacheRepository<Entity751> {
    @Override
    public Optional<Model751> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
