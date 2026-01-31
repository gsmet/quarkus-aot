package fr.spacefox.perftests.quarkus.core.service365;

import fr.spacefox.perftests.quarkus.core.port.data.Entity365DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service365.model.Model365;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service365 {

    private final Entity365DatasourcePort datasource;

    public Service365(Entity365DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model365 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
