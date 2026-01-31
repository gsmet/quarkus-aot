package fr.spacefox.perftests.quarkus.data.entity66;

import fr.spacefox.perftests.quarkus.core.port.data.Entity66DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service66.model.Model66;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity66Repository implements Entity66DatasourcePort, PanacheRepository<Entity66> {
    @Override
    public Optional<Model66> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
