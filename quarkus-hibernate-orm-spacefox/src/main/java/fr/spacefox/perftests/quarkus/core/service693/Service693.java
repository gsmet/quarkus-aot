package fr.spacefox.perftests.quarkus.core.service693;

import fr.spacefox.perftests.quarkus.core.port.data.Entity693DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service693.model.Model693;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service693 {

    private final Entity693DatasourcePort datasource;

    public Service693(Entity693DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model693 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
