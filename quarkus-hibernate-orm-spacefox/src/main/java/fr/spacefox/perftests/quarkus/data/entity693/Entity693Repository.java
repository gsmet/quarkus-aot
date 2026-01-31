package fr.spacefox.perftests.quarkus.data.entity693;

import fr.spacefox.perftests.quarkus.core.port.data.Entity693DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service693.model.Model693;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity693Repository implements Entity693DatasourcePort, PanacheRepository<Entity693> {
    @Override
    public Optional<Model693> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
