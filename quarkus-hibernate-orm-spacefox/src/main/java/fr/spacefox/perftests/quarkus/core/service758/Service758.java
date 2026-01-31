package fr.spacefox.perftests.quarkus.core.service758;

import fr.spacefox.perftests.quarkus.core.port.data.Entity758DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service758.model.Model758;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service758 {

    private final Entity758DatasourcePort datasource;

    public Service758(Entity758DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model758 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
