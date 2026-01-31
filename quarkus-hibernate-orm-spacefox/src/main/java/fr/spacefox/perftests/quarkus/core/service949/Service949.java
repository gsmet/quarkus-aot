package fr.spacefox.perftests.quarkus.core.service949;

import fr.spacefox.perftests.quarkus.core.port.data.Entity949DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service949.model.Model949;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service949 {

    private final Entity949DatasourcePort datasource;

    public Service949(Entity949DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model949 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
