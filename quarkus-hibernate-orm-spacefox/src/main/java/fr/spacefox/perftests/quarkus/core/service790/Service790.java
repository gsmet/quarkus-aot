package fr.spacefox.perftests.quarkus.core.service790;

import fr.spacefox.perftests.quarkus.core.port.data.Entity790DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service790.model.Model790;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service790 {

    private final Entity790DatasourcePort datasource;

    public Service790(Entity790DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model790 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
